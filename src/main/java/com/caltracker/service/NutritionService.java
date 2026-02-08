package com.caltracker.service;

import com.google.genai.Client;
import com.google.genai.types.Content;
import com.google.genai.types.Part;
import com.google.genai.types.GenerateContentResponse;
import com.caltracker.model.Meal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;

@Service
public class NutritionService {

    @Value("${google.api.key}")
    private String apiKey;

    public Meal analyzeMeal(byte[] imageBytes) throws Exception {
        Client client = Client.builder().apiKey(apiKey).build();

        // The SDK 1.4.1 way to build the prompt
        Part textPart = Part.builder().text("Identify food and calories. Format: Name: [name], Calories: [number]").build();
        Part imagePart = Part.builder().inlineData(Part.InlineData.builder()
                .mimeType("image/jpeg")
                .data(Base64.getEncoder().encodeToString(imageBytes))
                .build()).build();

        // Updated call syntax
        GenerateContentResponse response = client.getModels().generateContent(
                "gemini-1.5-flash",
                List.of(Content.builder().parts(List.of(textPart, imagePart)).build()),
                null
        );

        String result = response.getCandidates().get(0).getContent().getParts().get(0).getText();

        // Simple extraction logic
        String name = result.split("Name:")[1].split(",")[0].trim();
        int calories = Integer.parseInt(result.split("Calories:")[1].replaceAll("[^0-9]", ""));

        return new Meal(name, calories);
    }
}