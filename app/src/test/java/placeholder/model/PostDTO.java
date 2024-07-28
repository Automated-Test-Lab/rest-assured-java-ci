package placeholder.model;

import com.github.javafaker.Faker;

public class PostDTO {

    private String title;
    private String body;
    private String userId;

    Faker faker = new Faker();

    public PostDTO(String title, String body, String userId) {
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

    public PostDTO() {
        this.title = faker.book().title();
        this.body = faker.book().genre();
        this.userId = String.valueOf(faker.number().numberBetween(1,10));
    }

    public String getTitle() { return title; }

    public String getBody() { return body; }

    public String getUserId() { return userId; }
}
