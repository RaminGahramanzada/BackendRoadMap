# CommissionCalculator

Bu layihə, müxtəlif ödəniş metodlarına görə komissiya faizlərini hesablamaq üçün Open-Closed prinsipinə əsaslanan bir həll təqdim edir. Layihə, **strategy design pattern** istifadə edərək, komissiya hesablamalarını genişləndirmək və dəyişdirmək imkanı verir.

## Layihənin Məqsədi

Bu layihənin məqsədi müxtəlif ödəniş metodları üçün komissiya faizlərini hesablamaqdır. Hər bir ödəniş metodu (məsələn, Bank, Kart, Kripto) öz komissiya hesablamasını təqdim edir. Yeni metod əlavə etmək istədikdə mövcud kodu dəyişdirmək əvəzinə yalnız yeni bir class əlavə etmək yetərlidir.

## Struktur

- **CommissionStrategy Interface**: Bu interfeys komissiya hesablaması üçün ümumi metodları təyin edir. Hər bir ödəniş metodu bu interfeysi implement edir.
- **CommissionCalculator**: Bu class, `calculate` metodunu çağıraraq komissiya hesablamasını həyata keçirir. `CommissionStrategy` interfeysini implement edən class-ları qəbul edir.

## İstifadə Qaydası

1. **CommissionStrategy** interfeysini implement edən bir class yaradın. Məsələn, Bank, Kart və Kripto üçün ayrı-ayrı class-lar yaradın.
2. `CommissionCalculator` class-ını istifadə edərək komissiya hesablamasını həyata keçirin.
3. Hesablama nəticəsini əldə edin və çap edin.