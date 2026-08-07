public class demo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

            sb.append("Anny");
            sb.append("Singh");
            sb.append("aaaaa");
            // 6 + 6 + 5 = 17

            //sb.append(" Anny Singh");

        // //System.out.println(sb);

        // // insert()

        // sb.insert(2,  'o');

        // //System.out.println(sb); // Anony Singh

        // // delete()
        // sb.delete(0, 2);
        // System.out.println(sb);

        // sb.deleteCharAt(1);

        // replace();

        //sb.replace(1, 3, "XY");
        // System.out.println(sb);

        // sb.reverse();
        // System.out.println(sb);

        // sb.charAt(1);
        // sb.setCharAt(3, 'r');

        //System.out.println(sb.capacity());

        //sb.ensureCapacity(100);

        System.out.println(sb.capacity()); // 34

        sb.trimToSize(); // 17

        System.out.println(sb.capacity());
    }
}

