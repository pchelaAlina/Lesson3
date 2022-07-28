//Урок 3, задание 2
public class Product {
    private String name;
    private int article;

    public Product() {
    }

    public Product(String name) {
        this();
        this.name = name;
    }

    public Product(String name, int article) {
        this(name);
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Product{" + "name = '" + name + '\'' + ",article = " + article + '}';
    }
}
