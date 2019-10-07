import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankAccount implements Comparable, Measurable {
    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(Object o) {
        if (this.balance > ((BankAccount) o).balance)
            return 1;
        else if (this.balance == ((BankAccount) o).balance)
            return 0;
        else return -1;
    }

    @Override
    public String toString() {
        return "balance=" + balance;
    }
    @Override
    public float getMeasure() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount ac1 = new BankAccount(2000);
        BankAccount ac2 = new BankAccount(1000);
        BankAccount ac3 = new BankAccount(3000);
        System.out.println(ac1.compareTo(ac2));
        List<BankAccount> list = new ArrayList<>();
        list.add(ac1);
        list.add(ac2);
        list.add(ac3);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        //ArrayList<Measurable> = list;

        System.out.println(Measurable.average(list));

    }


}
