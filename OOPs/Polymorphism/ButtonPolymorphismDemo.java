// package OOPs.Polymorphism;

// class Button {

//     void onClick() {
//         System.out.println("Button Clicked");
//     }
// }

// class LoginButton extends Button {

//     @Override
//     void onClick() {
//         System.out.println("Login Button Clicked");
//     }
// }

// class RegisterButton extends Button {

//     @Override
//     void onClick() {
//         System.out.println("Register Button Clicked");
//     }
// }

// public class ButtonPolymorphismDemo {

//     public static void main(String[] args) {

//         Button button;

//         button = new LoginButton();
//         button.onClick();

//         button = new RegisterButton();
//         button.onClick();
//     }
// }