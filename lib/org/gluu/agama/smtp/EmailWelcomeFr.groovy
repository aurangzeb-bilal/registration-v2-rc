package org.gluu.agama.smtp;

import java.util.Map;

class EmailWelcomeFr {

    static Map<String, String> get(String userName) {

        String html = """
<table role="presentation" cellspacing="0" cellpadding="0" width="100%" style="background-color:#F2F4F6;margin:0;padding:0;width:100%;">
  <tbody>
    <tr>
      <td align="center">
        <table role="presentation" cellspacing="0" cellpadding="0" width="100%">
          <tbody>
            <tr>
              <td align="center" style="padding:25px 0;text-align:center;">
                <img src="https://storage.googleapis.com/email_template_staticfiles/Phi_logo320x132_Aug2024.png" width="160" alt="Phi Logo">
              </td>
            </tr>

            <tr>
              <td>
                <table role="presentation" cellspacing="0" cellpadding="0" width="570" align="center" style="background-color:#FFFFFF;border-radius:4px;">
                  <tbody>
                    <tr>
                      <td style="padding:45px;font-family:'Nunito Sans',Helvetica,Arial,sans-serif;font-size:16px;color:#51545E;line-height:1.625;">
                        <p>Bonjour,</p>
                        <p>Bienvenue sur <strong>Phi Wallet</strong> ! Votre parcours de protection patrimoniale commence maintenant.</p>

                        <p><strong>Détails de votre compte :</strong></p>
                        <div style="text-align:center;margin:30px 0;">
                          <div style="display:inline-block;background-color:#f5f5f5;color:#AD9269;font-size:28px;font-weight:600;letter-spacing:2px;padding:10px 20px;border-radius:4px;">
                            """ + userName + """
                          </div>
                        </div>

                        <p><strong>Prochaine étape : Vérifier votre identité</strong></p>
                        <p>Pour garantir que votre or reste exclusivement sous votre contrôle, nous devons vérifier votre identité. Cette mesure de sécurité protège votre or et vous confère tous les droits de propriété.</p>

                        <div style="text-align:center;margin:30px 0;">
                          <a href="https://link.phiwallet.com/vll3ylhkeqb" style="background-color:#AD9269;color:#ffffff;padding:14px 28px;text-decoration:none;border-radius:4px;font-weight:600;">
                            Ouvrir l'application
                          </a>
                        </div>

                        <p>Merci d’avoir choisi Phi Wallet.</p>
                        <p style="margin-top:30px;">Cordialement,<br>L’équipe Phi Wallet</p>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </td>
            </tr>

            <tr>
              <td>
                <table role="presentation" cellspacing="0" cellpadding="0" width="570" align="center" style="text-align:center;">
                  <tbody>
                    <tr>
                      <td style="padding:20px;font-size:12px;color:#666;">
                        <p style="font-size:14px;font-weight:bold;color:#565555;">Suivez-nous :</p>
                        <p>
                          <a href="https://www.facebook.com/PhiWallet"><img src="https://storage.googleapis.com/mwapp_prod_bucket/social_icon_images/facebook.png" style="height:20px;margin:0 5px;"></a>
                          <a href="https://x.com/PhiWallet"><img src="https://storage.googleapis.com/mwapp_prod_bucket/social_icon_images/twitter.png" style="height:20px;margin:0 5px;"></a>
                          <a href="https://www.instagram.com/phi.wallet"><img src="https://storage.googleapis.com/mwapp_prod_bucket/social_icon_images/instagram.png" style="height:20px;margin:0 5px;"></a>
                          <a href="https://www.linkedin.com/company/phiwallet"><img src="https://storage.googleapis.com/mwapp_prod_bucket/social_icon_images/linkedin.png" style="height:20px;margin:0 5px;"></a>
                        </p>
                        <p style="margin-top:10px;color:#A8AAAF;">
                          Phi Wallet Unipessoal LDA<br>
                          Avenida da Liberdade 262 R/C<br>
                          1250-149 Lisbonne, Portugal
                        </p>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </td>
            </tr>
          </tbody>
        </table>
      </td>
    </tr>
  </tbody>
</table>
""";

        return Map.of(
            "subject", "Bienvenue sur Phi Wallet",
            "body", html
        );
    }
}
