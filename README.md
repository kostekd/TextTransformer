# TextTransformer

Dla osób pracujących z danymi tekstowymi nasza aplikacja Text Transformer umożliwi transformacje danych tekstowych (np. zmiana wielkości liter, eliminacja duplikatów, itd.). Aplikacja będzie dostępna poprzez GUI a także zdalne API dzięki czemu będzie można ją zintegrować z istniejącymi narzędziami.

W pierwszym sprincie będziemy implementować następującą funkcjonalność:  
1. Jako twórca aplikacji mogę wywołać transformację zdalnie poprzez REST, aby móc  zintegrować narzędzie z moimi innymi aplikacjami  
2. Jako użytkownik mogę zmianać wielkości liter – zestaw trzech transformacji (upper, lower, capitalize)   
3. Jako użytkownik mogę o zamieniać wybrane (predefiniowane) słowa na skróty (Pieczywo to na przykład chleb i bułki -> Pieczywo to np. chleb i bułki) – zakres obsługiwanych skrótów do negocjacji  
4. Jako użytkownik mogę rozwijać wybrane skróty do pełnych postaci (Pan Prof. spóźnił się na zajęcia -> Pan Profesor spóźnił się na zajęcia)  
5. Jako użytkownik mogę eliminować powtarzające się wyrazy w bezpośrednim sąsiedztwie (Wyślij do do mnie wiadomość -> Wyślij do mnie wiadomość)  
6. Jako użytkownik mogę skorzystać z aplikacji za pomocą interfejsu użytkownika  
