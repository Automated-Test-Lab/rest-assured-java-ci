package placeholder.model;

import com.github.javafaker.Faker;

public class PostDTO {

    private String title;
    private String body;
    private Integer userId;
    private Integer id;

    Faker faker = new Faker();

    public PostDTO() {
        this.title = faker.book().title();
        this.body = faker.book().genre();
        this.userId = faker.random().nextInt(1, 100);
        this.id = faker.random().nextInt(1, 100);
    }

    public String getTitle() { return title; }

    public String getBody() { return body; }

    public Integer getUserId() { return userId; }

    public Integer getId() { return id; }

    public void setTitle(String title) { this.title = title; }

    public void setBody(String body) { this.body = body; }

    public void setUserId(Integer userId) { this.userId = userId; }

    public void setId(Integer id) { this.id = id; }
}
