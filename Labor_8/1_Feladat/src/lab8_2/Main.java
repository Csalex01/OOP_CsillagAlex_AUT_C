package lab8_2;

public class Main {

    public static void main(String[] args) {
        System.out.println("AGGREGATION\n----------");

        StackAggregation stAggrInt = new StackAggregation(10);
        StackAggregation stAggrChar = new StackAggregation(10);

        for(int i = 1; i <= 10; i++)
            stAggrInt.push(i * 10);

        for(int i = 0; i < 10; i++)
            stAggrChar.push((char)('A' + i));

        while(!stAggrInt.isEmpty())
            System.out.println(stAggrInt.pop());

        System.out.println();

        while(!stAggrChar.isEmpty())
            System.out.println(stAggrChar.pop());

        System.out.println("\nINHERITANCE\n----------");

        StackInheritance stInhInt = new StackInheritance(10);
        StackInheritance stInhChar = new StackInheritance(10);

        for(int i = 1; i <= 10; i++)
            stInhInt.push(i * 10);

        for(int i = 0; i < 10; i++)
            stInhChar.push((char)('A' + i));

        while(!stInhInt.isEmpty())
            System.out.println(stInhInt.pop());

        System.out.println();

        while(!stInhChar.isEmpty())
            System.out.println(stInhChar.pop());
    }

}
