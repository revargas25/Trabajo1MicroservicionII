/**
 * 
 */
package com.docker.example.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author rafael.e.vargas
 *
 */
@Controller
public class LoginBEController {
	@GetMapping("/crearLogin")
    public String crearLogin(@RequestParam(name="usuario", required=false, defaultValue="rafa") String usuario, @RequestParam(name="clave", required=false, defaultValue="12345") String clave, Model model) {
        model.addAttribute("usuario", usuario);
        model.addAttribute("clave", clave);
        Login login = new Login(usuario, clave);
        return LoginDao.crearLogin(login);
    }
}
