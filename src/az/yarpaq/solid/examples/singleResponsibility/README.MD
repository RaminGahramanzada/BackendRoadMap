📖 İlk öncə bu məqaləni oxuyun:
👉 https://medium.com/@ramingahramanzada_285/single-responsibility-principle-srp-a38742dc258f

👨‍💼 Elçin — Backend Developer

Bir gün rəhbər deyir:

    "Elçin, istifadəçi balansından pul çıxılanda log yazılsın, e-poçt göndərilsin və balans azalsın."

Elçin tələsik bir sinif yazır:

public class TransactionService {
public void withdraw(String accountId, double amount) {
// Balansı azaldır
System.out.println("✅ Hesabdan çıxarıldı: " + amount + " AZN");

        /
        System.out.println("📄 LOG: " + accountId + " hesabından " + amount + " AZN çıxarıldı");

        // Email göndərir
        System.out.println("📧 Email: Hörmətli " + accountId + ", balansınızdan " + amount + " AZN çıxarıldı");
    }
}

💥 Problem:

Sonra rəhbər deyir:

    "Biz logları indi fayla yazmaq istəyirik və e-poçt yerinə SMS göndərmək istəyirik."

Elçin tərləyir… çünki TransactionService sinifi hər şeyə qarışıb. Balansı da idarə edir, log da yazır, email də göndərir. 
Əgər bir hissəni dəyişmək istəsə, digər hissələr də korlana bilər.

Elçini vəziyyətdən çıxarmaq üçün doğru kodu yazaq.
