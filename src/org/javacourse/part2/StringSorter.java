package org.javacourse.part2;

public class StringSorter {

    public static void main(String[] args) {

    }

    private String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < roles.length; i++) {
            stringBuilder.append(roles[i]);
            stringBuilder.append(":");
            stringBuilder.append("\n");

            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ":")) {
                    stringBuilder.append(j + 1);
                    stringBuilder.append(")");
                    stringBuilder.append(textLines[j].substring(roles[i].length() + 1));
                    stringBuilder.append("\n");
                }
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }










}
