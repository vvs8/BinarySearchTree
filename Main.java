public class Main {
    public static void main(String[] args) {
        BSTree tree = new BSTree();
        Entry e1 = new Entry("data1");
        Entry e2 = new Entry("data2");
        Entry e3 = new Entry("data3");
        Entry e4 = new Entry("data4");
        Entry e5 = new Entry("data5");
        Entry e6 = new Entry("data6");
        Entry e7 = new Entry("data7");

        /*
			    4
		      /	  \
		    2	   6
		   / \    / \
	      1   3  5   7   */

        tree.insert(e4, 4);
        tree.printDiagram();
        tree.insert(e2, 2);
        tree.printDiagram();
        tree.insert(e6, 6);
        tree.printDiagram();
        tree.insert(e3, 3);
        tree.printDiagram();
        tree.insert(e5, 5);
        tree.printDiagram();
        tree.insert(e1, 1);
        tree.printDiagram();
        tree.insert(e7, 7);
        tree.printDiagram();
        tree.treeDetails();
        System.out.println(tree.getNode(2));

        //Remove node
        System.out.println("\nRemove key 2");
        tree.removeNode(2);
        tree.printDiagram();
        tree.treeDetails();

        //TEST 2
        System.out.println("\nTEST 2");
        BSTree tree2 = new BSTree();
        tree2.insert(e1, 1);
        tree2.printDiagram();
        tree2.insert(e2, 2);
        tree2.printDiagram();
        tree2.insert(e3, 3);
        tree2.printDiagram();
        tree2.insert(e4, 4);
        tree2.printDiagram();
        tree2.insert(e5, 5);
        tree2.printDiagram();
        tree2.insert(e6, 6);
        tree2.printDiagram();
        tree2.insert(e7, 7);
        tree2.printDiagram();
        tree2.treeDetails();
        System.out.println(tree2.getNode(2));

        //User Interface
        InputScan IS = new InputScan();
        IS.input();
    }
}
