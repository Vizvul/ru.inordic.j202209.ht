package practice.hospital;

import java.util.Random;
import java.util.Scanner;

public class Hospital {

    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);
        int patient = inter.nextInt();
        float[] bolnitsa = generatePatientsTemperatures(patient);
        System.out.println(getReport(bolnitsa));
    }

    public static float[] generatePatientsTemperatures(int lenthArrey){
        float[] result = new float[lenthArrey];

        int maxStart = 40;
        int minStart = 32;
        int maxEnd = 99;
        int minEnd = 0;
        int start = 0;
        int end = 0;

        float endFloat;

        Random random = new Random();

        for (int i = 0; i < result.length; i++) {
            start = random.nextInt(maxStart - minStart + 1);
            end = random.nextInt(maxEnd - minEnd + 1);
            endFloat = (float) end / 100;
            result[i] = (float) minStart + start + endFloat;
        }

    return result;
    }

    public static String getReport(float[] interFloatArrey){
        String result = "";
        float totalTemperture = 0f;
        int zdorovihPatientov = 0;

        for (int i = 0; i < interFloatArrey.length; i++) {
            if(interFloatArrey[i] >= 36.2 && interFloatArrey[i] <= 36.9){zdorovihPatientov++;}
            totalTemperture = totalTemperture + interFloatArrey[i];
            result = result + " (" + (i+1) + ") " + interFloatArrey[i];
        }
        String totalTempString = String.format("%.2f", totalTemperture/interFloatArrey.length);
        result = result + "\nCреднее арифметическое значение температуры: " + totalTempString;
        result = result + "\nКоличество здоровых пациентов с температурой от 36,2 до 36,9 градусов: " + zdorovihPatientov;

    return result;
    }
}
