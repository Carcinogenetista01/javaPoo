public class tarea1 {
    public static void main(string[] args) {
    
        String s = "Hola";int x = s.length();// retorna: 4
    
    String s1 = "Hola";
    boolean b1 = s1.isEmpty();// retorna: false
    String s2 = "";
    boolean b2 = s2.isEmpty();// retorna: true
    String t = "Hola";
    for(int i=0; i<t.length(); i++)
    {
        char c = t.charAt(i);
        System.out.println(c);// SALIDA: H o l a
    
    }
    String x = "Hola";
    String y = "Hola";
    if( x.equals(y) )// compara sus contenidos, retorna true!
    {
        System.out.println("SI pasa por aqui!");
    }
    String s = "Hola, como estas?";
    int p1 = s.indexOf('a'); // retorna: 3
    int p2 = s.lastIndexOf('a');// retorna: 14
    String s = "Hola, como estas? Estas como querias?";
    int p1 = s.indexOf("como");// retorna: 6
    int p2 = s.indexOf("estas");// retorna: 11
    int p3 = s.lastIndexOf("como");// retorna: 24
    
    String s = "Hola, como estas?";
    String may = s.toUpperCase();// retorna: HOLA, COMO ESTAS?
    String min = s.toLowerCase();// retorna: hola, como estas?
    
    String s = "Hola, como estas?";
    String s1 = s.substring(0,4);// retorna: Hola
    String s2 = s.substring(6,10);// retorna: como
    String s3 = s.substring(11);// retorna: estas?
    
    / enteros
    String s1 = "1234";
    int i = Integer.parseInt(s1);// retorna: 1234
    String t1 = Integer.toString(i);// retorna: "1234"
    // flotantes
    String s2 = "1234.56";
    double d = Double.parseDouble(s2);// retorna: 1234.56
    String t2 = Double.toString(d);// retorna: "1234.56"
    String s = "Hola, ";
    String t = "que tal?";
    String u = s+t;// retorna: "Hola, que tal?"
    
    String s = "Hola";
    s = "chau";
    System.out.println(s);// SALIDA: chau
    
    String s = "Hola";
    s+= ", chau";// concatenamos?
    System.out.println(s);// SALIDA: Hola, chau
    
    StringBuilder sb = new StringBuilder();
    sb.append("Hola, ");
    sb.append("Chau");
    System.out.println(sb);// SALIDA: Hola, chau
    StringBuilder sb = new StringBuilder("Hola");
    sb.setCharAt(2,'X');
    System.out.println(sb);// SALIDA: HoXa
    }