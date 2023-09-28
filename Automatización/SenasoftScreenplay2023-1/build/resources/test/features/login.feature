Feature: Login successful


  #Este escenario describe una prueba exitosa de inicio de sesión.
  #El usuario ingresa al sitio web, proporciona las credenciales
  #(correo electrónico y contraseña)
  #y luego verifica que ha iniciado sesión correctamente. */
  Scenario: Login
    Given he user enters the website
    When he user enters the credentials
    |email|password|
    |carlosprogramador8@gmail.com|Programador8|
     Then  he user is logged in


  #Este escenario describe una prueba de inicio de sesión con un error.
  #El usuario ingresa al sitio web, proporciona un correo
  #electrónico incorrecto y luego verifica que no ha iniciado
  #sesión correctamente


    Scenario: Login Error
      Given he user enters the website
      When he user enters the email wrong
        |emailError|
        |carlosprogor8@gmail.com|
      Then  user not logged in


    # escenario describe una prueba de inicio de sesión con un error debido
    #una estructura de correo electrónico incorrecta.
    #El usuario ingresa al sitio web, proporciona un correo electrónico con una
    #estructura incorrecta y luego verifica que no puede iniciar sesión correctamente.

      Scenario: Login error Gmail
        Given he user enters the website
        When he user enters the wrong email structure
          |gmailIncompleto|
          |carlosprogor|
        Then he user cannot log in

