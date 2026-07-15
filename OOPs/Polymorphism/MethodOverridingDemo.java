// Method overriding means Run time polymorphism.

package OOPs.Polymorphism;

class Button {

    void onClick() {
        System.out.println("Button Clicked");
    }
}

class LoginButton extends Button {

    @Override
    void onClick() {
        System.out.println("Login Button Clicked");
    }
}

class RegisterButton extends Button {

    @Override
    void onClick() {
        System.out.println("Register Button Clicked");
    }
}

public class MethodOverridingDemo {

    public static void main(String[] args) {

        LoginButton login = new LoginButton();
        RegisterButton register = new RegisterButton();

        login.onClick();

        register.onClick();
    }
}