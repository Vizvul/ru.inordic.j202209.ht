package ru.inordic.j202209.ht.lesson13;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class AutoSpaceNormalased {
    static boolean needToAdd = false; // Переменная для добавления(false) и стирания данных(true)

    // Тест переданных данных
    public boolean normalisedSpaceProver(File inToTestIn, File outToTestIn) throws IOException {
        Boolean result = true;
        if (!inToTestIn.exists()) {
            System.out.println("По указанному пути файл отсутствует или закрыт для чтения");
            result = false;
        } else if (!outToTestIn.exists()) {
            File forMD = new File(outToTestIn.getParent());
            forMD.mkdirs();
            outToTestIn.createNewFile();
            System.out.println("Отсутствует файл для записи, директории и файл созданы");
        } else {
            boolean question = true;
            while (question) {
                System.out.println("Файл для записи уже существует в директории. Переписать(1) или продолжить заполнение(2)?");
                Scanner sc = new Scanner(System.in);
                int otvet = sc.nextInt();
                switch (otvet) {
                    case 1:
                        System.out.println("Данные будут удалены и внесены новые");
                        question = false;
                        break;
                    case 2:
                        System.out.println("Данные будут сохранены и добавлены новые");
                        needToAdd = true;
                        question = false;
                        break;
                    default:
                        System.out.println("Посмотрите внимательно на вопрос и введите ответ еще раз");
                }
            }
        }
        return result;
    }
    // Считывание и запись результата
    public void normalisedSpace(File in, File out) throws IOException {
        if (normalisedSpaceProver(in, out)) {
            StringBuilder sb = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader(in));) {
                String storkaTeksta = br.readLine();
                while (storkaTeksta != null) {
                    sb.append(normalisedLine(storkaTeksta));
                    sb.append(System.lineSeparator());
                    storkaTeksta = br.readLine();
                }
            }
            FileOutputStream bW;
            byte[] result = sb.toString().getBytes(StandardCharsets.UTF_8);
            bW = new FileOutputStream(out, needToAdd);
            bW.write(result);
            bW.close();
        }
    }
    // Сам парсер
    public String normalisedLine(String sb)  {
        char[] charForNormalised = sb.toCharArray();
        int simbol = 0;
        int bukva = 0;

        StringBuilder word = new StringBuilder();

        for (int i = 0; i < charForNormalised.length; i++) {
            if (Character.isAlphabetic(charForNormalised[i])) {
                if (!word.isEmpty() && (bukva == 0)) {
                    word.append(" ");
                }
                bukva = 1;
                simbol = 0;
                word.append(charForNormalised[i]);
            } else if (charForNormalised[i] == ' ') {
                bukva = 0;
            } else if (charForNormalised[i] == ',') {
                if (simbol == 0 && !word.isEmpty()) {
                    simbol = 1;
                    bukva = 0;
                    word.append(charForNormalised[i]);
                }
            } else {
                word.append(charForNormalised[i]);
            }
        }
        // Убираем в конце текста описку - если стоит запятая ставим вместо нее в конец точку,
        // если много пробелов, то все удаляем,
        // если доходим до слова, останавливаем работу
        while (simbol == 1) {
            if (word.charAt(word.length() - 1) == ',') {
                word.delete(word.length() - 1, word.length());
                word.append('.');
                simbol = 1;
            } else if (word.charAt(word.length() - 1) == ' ') {
                word.delete(word.length() - 1, word.length());
            } else {
                simbol = 0;
            }
        }
        return word.toString();
    }
}