package behavioral.interpreter;

public class Demo {
    public static void main(String[] args) {
        Expression checkBalance = getBalance();
        Expression foreignCurrencies = getCurrencies();

        System.out.println("You have enough money - " + checkBalance.interpret("enough money"));
        System.out.println("You have some in foreign currency - " + foreignCurrencies.interpret("usd"));
    }

    private static Expression getCurrencies() {
        Expression usd = new TerminalExpression("usd");
        Expression euro = new TerminalExpression("euro");

        return new OrExpression(usd, euro);
    }

    private static Expression getBalance() {
        Expression count = new TerminalExpression("enough");
        Expression money = new TerminalExpression("money");

        return new AndExpression(count, money);
    }
}

