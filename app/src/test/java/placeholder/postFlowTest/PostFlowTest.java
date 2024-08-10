package placeholder.postFlowTest;

import org.junit.Test;
import placeholder.control.Posts;
import com.github.javafaker.Faker;
import placeholder.model.PostDTO;

public class PostFlowTest {

    Faker faker = new Faker();

    @Test
    public void PostFlowTest() {

        PostDTO postDTO = new PostDTO();
        String id = String.valueOf(faker.random().nextInt(1, 100));

        Posts.createPost(postDTO, 201);
        Posts.updatePost(postDTO, 200, id);
        Posts.getPostByUserId(id);
        Posts.deletePost(id);
        Posts.getPosts();
    }
}
