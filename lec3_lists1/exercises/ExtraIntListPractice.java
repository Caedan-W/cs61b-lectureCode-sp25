package lec3_lists1.exercises;

public class ExtraIntListPractice {
    /** Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
//        IntList Q = new IntList(L.first + x, null);
//        IntList p = Q;
//        for (IntList cur = L.rest; cur != null; cur = cur.rest) {
//            p.rest = new IntList(cur.first + x, null);
//            p = p.rest;
//        }
//        return Q;
        if (L == null) return null;
        // 每一步都构造新节点，递归处理 rest
        return new IntList(L.first + x, incrList(L.rest, x));
    }

    /** Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        if (L == null) return null;
        L.first = L.first + x;
        L.rest = dincrList(L.rest, x);
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        //System.out.println(L.size());
        //System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        System.out.println(L.get(1));
        System.out.println(incrList(L, 3));
        System.out.println(dincrList(L, 3).get(0));
    }
}