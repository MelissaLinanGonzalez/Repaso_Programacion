# Aplicación de Salud y Fitness

Se solicita crear una aplicación de salud y fitness que solicite lo siguiente:
- Nombre del usuario
- Pasos caminados en el día

Además definiremos las siguientes constantes:
```
META_PASOS_DIARIOS = 10000
CALORIAS_POR_PASO = 0.04 // Valor aprox en kcal
```
Con los valores anteriores debemos calcular las calorías quemadas según los pasos caminados
```
calorias_quemadas = pasos_diarios * CALORIAS_POR_PASO
```
Y verificamos si se cumplió la meta de pasos diarios
```
meta_alcanzada = pasos_diarios >= META_PASOS_DIARIO
```