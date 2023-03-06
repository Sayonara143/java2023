package mathemat;

class MathCustom {
    private MathCustom(){}

    /**
     * Возвращает факториал числа
     * @param x число
     * @return факториал
     */
    public static int factorial(int x){
        int result = 1;
        for (int i = 1; i <= x; i++)
        {
            result *= i;
        }
        return result;
    }

    /**
     * Возвращает sign аргумента
     * @param num число
     * @return int
     */
    public static int getSign(int num) {
        return Integer.signum(num);

    }

}
