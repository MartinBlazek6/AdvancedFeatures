package exceptions;

import java.util.regex.Pattern;

public class UserValidator {

    public static void main(String[] args) {
        validateEmails("valid@email.sk","nonvalidemail");
    }
    public static class Email {
        private String address;

        public Email(String address) {
            this.address = address;
        }

        public String formatEmail() {
            if (address == null || address.isEmpty()) {
                return "unknown";
            }

            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]+$";
            if (!Pattern.matches(emailRegex, address)) {
                return "unknown";
            }

            return address;
        }
    }

    public static void validateEmails(String email, String alternativeEmail) {
        Email emailObj = new Email(email);
        Email alternativeEmailObj = new Email(alternativeEmail);

        String formattedEmail = emailObj.formatEmail();
        String formattedAlternativeEmail = alternativeEmailObj.formatEmail();

        System.out.println("Email: " + formattedEmail);
        System.out.println("Alternative Email: " + formattedAlternativeEmail);
    }
}
