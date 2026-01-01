// public class Array {
public class Main {
    public static void main(String[] args) {
        Array array = new Array(5);
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);

        System.out.println("Original Array:");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }

        array.reverse();

        System.out.println("\nReversed Array:");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}
//     private int[] elements;
//     private int size;

//     public Array(int capacity) {
//         elements = new int[capacity];
//         size = 0;
//     }

//     public void add(int element) {
//         if (size < elements.length) {
//             elements[size] = element;
//             size++;
//         } else {
//             throw new ArrayIndexOutOfBoundsException("Array is full");
//         }
//     }

//     public int get(int index) {
//         if (index >= 0 && index < size) {
//             return elements[index];
//         } else {
//             throw new ArrayIndexOutOfBoundsException("Index out of bounds");
//         }
//     }

//     public int size() {
//         return size;
//     }
// }


//array sum
// public class Array {
//     private int[] elements;
//     private int size;

//     public Array(int capacity) {
//         elements = new int[capacity];
//         size = 0;
//     }

//     public void add(int element) {
//         if (size < elements.length) {
//             elements[size] = element;
//             size++;
//         } else {
//             throw new ArrayIndexOutOfBoundsException("Array is full");
//         }
//     }

//     public int get(int index) {
//         if (index >= 0 && index < size) {
//             return elements[index];
//         } else {
//             throw new ArrayIndexOutOfBoundsException("Index out of bounds");
//         }
//     }

//     public int size() {
//         return size;
//     }

//     // Method to calculate the sum of all elements in the array
//     public int sum() {
//         int total = 0;
//         for (int i = 0; i < size; i++) {
//             total += elements[i];
//         }
//         return total;
//     }
// }


// public class Array {
//     private int[] elements;
//     private int size;

//     public Array(int capacity) {
//         elements = new int[capacity];
//         size = 0;
//     }

//     public void add(int element) {
//         if (size < elements.length) {
//             elements[size] = element;
//             size++;
//         } else {
//             throw new ArrayIndexOutOfBoundsException("Array is full");
//         }
//     }

//     public int get(int index) {
//         if (index >= 0 && index < size) {
//             return elements[index];
//         } else {
//             throw new ArrayIndexOutOfBoundsException("Index out of bounds");
//         }
//     }

//     public int size() {
//         return size;
//     }

//     // Method to calculate the sum of all elements in the array
//     public int sum() {
//         int total = 0;
//         for (int i = 0; i < size; i++) {
//             total += elements[i];
//         }
//         return total;
//     }
// }


//array average
// public class Array {
//     private int[] elements;
//     private int size;

//     public Array(int capacity) {
//         elements = new int[capacity];
//         size = 0;
//     }

//     public void add(int element) {
//         if (size < elements.length) {
//             elements[size] = element;
//             size++;
//         } else {
//             throw new ArrayIndexOutOfBoundsException("Array is full");
//         }
//     }

//     public int get(int index) {
//         if (index >= 0 && index < size) {
//             return elements[index];
//         } else {
//             throw new ArrayIndexOutOfBoundsException("Index out of bounds");
//         }
//     }

//     public int size() {
//         return size;
//     }

//     // Method to calculate the sum of all elements in the array
//     public int sum() {
//         int total = 0;
//         for (int i = 0; i < size; i++) {
//             total += elements[i];
//         }
//         return total;
//     }

//     // Method to calculate the average of all elements in the array
//     public double average() {
//         if (size == 0) {
//             throw new IllegalStateException("Array is empty");
//         }
//         return (double) sum() / size;
//     }
// }


//array max
// public class Array {
//     private int[] elements;
//     private int size;

//     public Array(int capacity) {
//         elements = new int[capacity];
//         size = 0;
//     }

//     public void add(int element) {
//         if (size < elements.length) {
//             elements[size] = element;
//             size++;
//         } else {
//             throw new ArrayIndexOutOfBoundsException("Array is full");
//         }
//     }

//     public int get(int index) {
//         if (index >= 0 && index < size) {
//             return elements[index];
//         } else {
//             throw new ArrayIndexOutOfBoundsException("Index out of bounds");
//         }
//     }

//     public int size() {
//         return size;
//     }

//     // Method to calculate the sum of all elements in the array
//     public int sum() {
//         int total = 0;
//         for (int i = 0; i < size; i++) {
//             total += elements[i];
//         }
//         return total;
//     }

//     // Method to calculate the average of all elements in the array
//     public double average() {
//         if (size == 0) {
//             throw new IllegalStateException("Array is empty");
//         }
//         return (double) sum() / size;
//     }

//     // Method to find the maximum element in the array
//     public int max() {
//         if (size == 0) {
//             throw new IllegalStateException("Array is empty");
//         }
//         int maxElement = elements[0];
//         for (int i = 1; i < size; i++) {
//             if (elements[i] > maxElement) {
//                 maxElement = elements[i];
//             }
//         }
//         return maxElement;
//     }
// }


//array min
// public class Array {
//     private int[] elements;
//     private int size;

//     public Array(int capacity) {
//         elements = new int[capacity];
//         size = 0;
//     }

//     public void add(int element) {
//         if (size < elements.length) {
//             elements[size] = element;
//             size++;
//         } else {
//             throw new ArrayIndexOutOfBoundsException("Array is full");
//         }
//     }

//     public int get(int index) {
//         if (index >= 0 && index < size) {
//             return elements[index];
//         } else {
//             throw new ArrayIndexOutOfBoundsException("Index out of bounds");
//         }
//     }

//     public int size() {
//         return size;
//     }

//     // Method to calculate the sum of all elements in the array
//     public int sum() {
//         int total = 0;
//         for (int i = 0; i < size; i++) {
//             total += elements[i];
//         }
//         return total;
//     }

//     // Method to calculate the average of all elements in the array
//     public double average() {
//         if (size == 0) {
//             throw new IllegalStateException("Array is empty");
//         }
//         return (double) sum() / size;
//     }

//     // Method to find the maximum element in the array
//     public int max() {
//         if (size == 0) {
//             throw new IllegalStateException("Array is empty");
//         }
//         int maxElement = elements[0];
//         for (int i = 1; i < size; i++) {
//             if (elements[i] > maxElement) {
//                 maxElement = elements[i];
//             }
//         }
//         return maxElement;
//     }

//     // Method to find the minimum element in the array
//     public int min() {
//         if (size == 0) {
//             throw new IllegalStateException("Array is empty");
//         }
//         int minElement = elements[0];
//         for (int i = 1; i < size; i++) {
//             if (elements[i] < minElement) {
//                 minElement = elements[i];
//             }
//         }
//         return minElement;
//     }
// }

//array reverse
public class Array {
    private int[] elements;
    private int size;

    public Array(int capacity) {
        elements = new int[capacity];
        size = 0;
    }

    public void add(int element) {
        if (size < elements.length) {
            elements[size] = element;
            size++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        }
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        } else {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
    }

    public int size() {
        return size;
    }

    // Method to calculate the sum of all elements in the array
    public int sum() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += elements[i];
        }
        return total;
    }

    // Method to calculate the average of all elements in the array
    public double average() {
        if (size == 0) {
            throw new IllegalStateException("Array is empty");
        }
        return (double) sum() / size;
    }

    // Method to find the maximum element in the array
    public int max() {
        if (size == 0) {
            throw new IllegalStateException("Array is empty");
        }
        int maxElement = elements[0];
        for (int i = 1; i < size; i++) {
            if (elements[i] > maxElement) {
                maxElement = elements[i];
            }
        }
        return maxElement;
    }

    // Method to find the minimum element in the array
    public int min() {
        if (size == 0) {
            throw new IllegalStateException("Array is empty");
        }
        int minElement = elements[0];
        for (int i = 1; i < size; i++) {
            if (elements[i] < minElement) {
                minElement = elements[i];
            }
        }
        return minElement;
    }

    // Method to reverse the elements in the array
    public void reverse() {
        for (int i = 0; i < size / 2; i++) {
            int temp = elements[i];
            elements[i] = elements[size - 1 - i];
            elements[size - 1 - i] = temp;  
        }
    }   
}
public static void main(String[] args) {
    Array array = new Array(5);
    array.add(10);
    array.add(20);
    array.add(30);
    array.add(40);
    array.add(50);

    System.out.println("Original Array:");
    for (int i = 0; i < array.size(); i++) {
        System.out.print(array.get(i) + " ");
    }

    array.reverse();

    System.out.println("\nReversed Array:");
    for (int i = 0; i < array.size(); i++) {
        System.out.print(array.get(i) + " ");
    }
}