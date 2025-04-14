public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private Node current;
    private int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        current = null;
        size = 0;
    }

    // Inserta un nuevo nodo al final de la lista
    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            // Lista vacía
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
            current = head;
        } else {
            // Insertar al final
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
        size++;
    }

    // Avanza al siguiente nodo
    public void next() {
        if (current != null) {
            current = current.next;
        }
    }

    // Retrocede al nodo anterior
    public void previous() {
        if (current != null) {
            current = current.prev;
        }
    }

    // Imprime el valor del nodo actual
    public void printCurrent() {
        if (current != null) {
            System.out.println("Nodo actual: " + current.value);
        } else {
            System.out.println("La lista está vacía.");
        }
    }

    // Verifica si la lista está vacía
    public boolean isEmpty() {
        return head == null;
    }

    // Obtiene el tamaño de la lista
    public int getSize() {
        return size;
    }
}