package practice.java_NumbersAndDates;

public class TrucksAndContainers {




    public String result(int interYaschik) {
        int yaschik = 0;
        String result = "";

        int CONSTYASCHIK = 5;
        int CONSTCONT = 2;

        int gruzovik = 0;
        int contener = 0;

        for (int i = 0; i < interYaschik; i++) {
            if (yaschik == interYaschik) {break;}
            gruzovik++;
            result = result + "Грузовик: " + gruzovik + System.lineSeparator();

            for (int j = 0; j < CONSTCONT; j++) {
                if (yaschik == interYaschik) {break;}
                contener++;
                result = result + "\tКонтейнер: " + contener + System.lineSeparator();

                for (int k = 0; k < CONSTYASCHIK; k++) {
                    yaschik++;
                    result = result + "\t\tЯщик: " + yaschik + System.lineSeparator();
                    if(yaschik == interYaschik) {break;}
                }

            }

        }
        result = result + System.lineSeparator() + "Необходимо:" + System.lineSeparator() + System.lineSeparator() +
                "Грузовиков: " + gruzovik + " шт." + System.lineSeparator() + "Контейнеров: " + contener + " шт.";


        return result;
    }
}
