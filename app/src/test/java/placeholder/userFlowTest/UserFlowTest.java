package placeholder.userFlowTest;

import org.junit.Test;
import placeholder.control.Users;

public class UserFlowTest {

    @Test
    public void UserFlowTest() {
        Users.getUsers();
        Users.getUserById(String.valueOf(2));
    }

}
