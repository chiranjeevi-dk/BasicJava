package java_Basics;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    static final int ROCK = 1;
    static final int PAPER = 2;
    static final int SCISSOR = 3;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Rock Paper Scissorsゲームへようこそ");

        // ゲームを再生するためのループ
        while (true) {
            System.out.println("ゲームを始める場合は、0以外の数字を押してください");

            // ユーザーがプレイしたいかどうかを確認
            if (sc.nextInt() == 0) {
                break;
            }

            System.out.println("ゲームが始まります。3、2、1...");
            rockPaperScissor();

            System.out.println("もう一度ゲームをプレイする場合は、0以外の数字を押してください");
        }

        System.out.println("Rock Paper Scissorsをプレイしていただきありがとうございます！");
    }

    private static void rockPaperScissor() {
        System.out.println("あなたの選択:");
        System.out.println("1. グー");
        System.out.println("2. パー");
        System.out.println("3. チョキ");

        int userChoice = sc.nextInt();

        // ユーザーの入力を確認
        if (userChoice < ROCK || userChoice > SCISSOR) {
            System.out.println("無効な入力です！グーには1、パーには2、チョキには3を選んでください。");
            return;
        }

        Random random = new Random();
        int computerChoice = random.nextInt(SCISSOR) + 1; // コンピューターのランダムな選択を生成

        // 選択を表示
        displayChoice("あなたの選択", userChoice);
        displayChoice("コンピューターの選択", computerChoice);

        // 勝者を決定
        determineWinner(userChoice, computerChoice);
    }

    private static void displayChoice(String player, int choice) {
        System.out.println(player + ": " + choiceToString(choice));
    }

    private static String choiceToString(int choice) {
        switch (choice) {
            case ROCK:
                return "グー";
            case PAPER:
                return "パー";
            case SCISSOR:
                return "チョキ";
            default:
                return "不明";
        }
    }

    private static void determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            System.out.println("引き分けです！");
        } else if ((userChoice == ROCK && computerChoice == SCISSOR) ||
                (userChoice == PAPER && computerChoice == ROCK) ||
                (userChoice == SCISSOR && computerChoice == PAPER)) {
            System.out.println("勝ちました！コンピューターは負けました。");
        } else {
            System.out.println("コンピューターの勝利。あなたは負けました！");
        }
    }
}

