public class Omikuji {
    public String drawResult() {

        String result ="";
        String luckyWord ="";

        int randomNumber = (int) (Math.random() * 4) + 1;

        if (randomNumber == 1) {
           result = "        ⭐  大吉　⭐";
            luckyWord = "🙌何をやってもうまくいくでしょう🙌";

        } else if (randomNumber == 2) {
            result = "       👌　中吉　👌";
            luckyWord = " 💻いつも通り頑張りましょう💻";

        } else if (randomNumber == 3) {
            result = "       😏　小吉　😏";
            luckyWord = "☎後回しにせずにすぐに実行しましょう☎";

        } else {
            result = "       👾　大凶　👾";
            luckyWord = "☕無理せずに一休みしてください☕‍";

        }
        return "\n=============================\n"
             +"       📚今日の運勢📚\n"
                +"=============================\n"
                +result + "\n"
               + luckyWord +"\n"
                +"=============================\n";
    }
}