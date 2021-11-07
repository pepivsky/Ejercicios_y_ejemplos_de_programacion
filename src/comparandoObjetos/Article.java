package comparandoObjetos;
/*
In the example below, you can see our class Article. It has two fields: title and size. You should implement comparing articles by their size, and if their sizes are equal, compare them by title.

 Report a typo
Sample Input 1:

How to bake an awesome cake?-300
Alice likes pancakes...But who doesn't?-800
Germany wants to win EURO 2020!-500
Sample Output 1:

How to bake an awesome cake? 300
Germany wants to win EURO 2020! 500
Alice likes pancakes...But who doesn't? 800
 */
class Article implements Comparable<Article> {
    private String title;
    private int size;

    public Article(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    // haciendo una implementacion propia para poder comparar objetos personalizados
    // 1 si el actual es mayor
    // -1 si es menor
    // 0 si son iguales
    // comparando por su tamano, si es igual entonces comparamos por su titulo(alfabeticamente)
    @Override
    public int compareTo(Article otherArticle) {
        int result = Integer.valueOf(this.getSize()).compareTo(otherArticle.getSize()); // comparando size (los objetos tienen el metodo compare to)
        if (result == 0) {
            return this.getTitle().compareTo(otherArticle.getTitle()); // comparando title
        }
        return result;
        /* solucion con operador ternario
        int bySize = Integer.compare(this.size, otherArticle.getSize());
        int byTitle = this.title.compareTo(otherArticle.getTitle());

        return bySize == 0 ? byTitle : bySize;
         */
    }

    public static void main(String[] args) {
        Article myArticle = new Article("Java language", 213); // menor
        Article mySecondArticle = new Article("Kotlin language", 213); // mayor

        System.out.println(myArticle.compareTo(mySecondArticle) > 0 ? "my article es mayor": "my article es menor");
    }
}
