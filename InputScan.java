import java.util.*;

public class InputScan {
    Scanner scan;
    Scanner scan2;

    public InputScan() {
        scan = new Scanner(System.in);
        scan2 = new Scanner(System.in);
    }

    private void input2(BSTree BST) {
        System.out.println("Enter the key: ");
        Integer n  = scan2.nextInt();
        BST.insert(new Entry("data"), n);
        BST.printDiagram();
    }

    public void input() {
        BSTree BST = new BSTree();
        boolean B = true;
        while (B = true) {
            System.out.println("Add Node? [Y]es [N]o ");
            String textinput = scan.nextLine();
            if (textinput.equals("Y")) {
               input2(BST);
               B = true;
            }
            else {
                B = false;
                break;
            }
        }
    }


}