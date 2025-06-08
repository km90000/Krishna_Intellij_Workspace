public class FindDuplicateWordsOfString {
    public static void main(String[] args) {
        String str = "Hello java Programs java hello";
        String[] strArray = str.toLowerCase().trim().split(" ");
        int count;
        StringBuilder duplicates = new StringBuilder();
        for (int i = 0; i < strArray.length; i++) {
            count = 1;
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[i].equals(strArray[j])) {
                    count++;
                }
            }
            if (count > 1)
                if (duplicates.length() == 0) {
                    duplicates.append(" ").append(strArray[i]).append(" : ").append(count);
                } else if (!duplicates.toString().matches("(.*)" + strArray[i] + "(.*)")) {
                    duplicates.append(" ").append(strArray[i]).append(" : ").append(count);
                }
        }
        System.out.println(duplicates);
    }
}
