package hw2;


public class Question5 {
    public static void main(String[] args) {
        Question5 q = new Question5();
        q.getAllLotteryNumber(4);
    }

    public void getAllLotteryNumber(int n) {

        // 外圈:10位數
        for (int i = 0; i <= 40; i += 10) {
            if (i == n * 10) {
                continue;
            }
            // 內圈:各位數
            for (int j = 0; j <= 9; j++) {
                if (j == n || (i == 0 && j == 0)) {
                    continue;
                }

                System.out.print(i+j + "\t");
            }
            
            // 在每行結束時換行
            System.out.println();
        }

      
    }

}
