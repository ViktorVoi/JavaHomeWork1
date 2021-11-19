package com.pb.voitovych.hw8;

public class Auth {
    private String login;
    private String password;

    public void singUp(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        WrongLoginException errorLogin = new WrongLoginException("Недотримані вимоги безпеки до логіну") ;
        WrongPasswordException errorPassword =
                new WrongPasswordException("Недотримані вимоги безпеки до паролю, " +
                        "або паролі не співпадають")   ;


        if (login.length() < 5 || login.length() > 20 ) {
            throw errorLogin ;
        }
        char[] chl = login.toUpperCase().toCharArray() ;
        for (char c: chl) {
            if (!((c >= "A".charAt(0) && c <= "Z".charAt(0))
                    || (c >= "0".charAt(0) && c <= "9".charAt(0)))) {
                throw errorLogin;
            }
        }

        if (password.length() < 5) {
            throw errorPassword ;
        }
        char[] chp = password.toUpperCase().toCharArray() ;
        for (char c: chp) {
            if (!((c >= "A".charAt(0) && c <= "Z".charAt(0))
                    || ((c >= "0".charAt(0) && c <= "9".charAt(0))
            || c == "_".charAt(0)))) {
                throw errorPassword;
            }
        }


        if (!password.equals(confirmPassword)) {
            throw errorPassword ;
        }
        this.login = login ;
        this.password = password ;

        System.out.println(this.login + "! Ви успішно зареєструвалися!");
    }

    public void singIn(String login, String password) throws WrongLoginException {
        if (!login.equals(this.login) || !password.equals(this.password)) {
            throw new WrongLoginException("Неправильний логін чи пароль") ;
        }
        System.out.println("Вітаю, "+ this.login + "! Ви успішно авторизувалися!");
    }
}


