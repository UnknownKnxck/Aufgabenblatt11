package b;
public class Main {
    public static void main(String[] args) {
        List<String> list = new List<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println("List after adding elements: " + listToString(list));

        list.add("e", 2);
        System.out.println("List after adding element at index: " + listToString(list));

        list.set("f", 3);
        System.out.println("List after setting element at index: " + listToString(list));

        String removedElement = list.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("List after removing last element: " + listToString(list));

        removedElement = list.remove(1);
        System.out.println("Removed element: " + removedElement);
        System.out.println("List after removing element at index: " + listToString(list));

        String element = list.get(2);
        System.out.println("Element at index 2: " + element);

        System.out.println("Size of list: " + list.size());
    }

    private static String listToString(List<?> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
