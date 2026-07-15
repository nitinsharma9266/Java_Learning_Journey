package Collection_Framework;

/*
# ================== COLLECTIONS FRAMEWORK - PART 2 ==================

# Topic : Collection Hierarchy

## Introduction

Collection Framework Java ki predefined Classes aur Interfaces ka group hai jo data ko efficiently store aur manage karne ke liye banaya gaya hai.

Collection Framework me alag-alag Data Structures isliye diye gaye hain kyunki har problem ko solve karne ke liye alag Data Structure ki zarurat hoti hai.

Example:

WhatsApp Chats

→ Order Maintain hona chahiye.

Instagram Feed

→ Dynamic Data Store karna hota hai.

Student Roll Number

→ Duplicate Allow nahi hone chahiye.

Bank Account

→ Key-Value Pair me Data Store karna hota hai.

Isi wajah se Java ne alag-alag Interfaces aur Classes provide ki hain.

---

# Collection Hierarchy

```
                         Iterable (Interface)
                               │
                        Collection (Interface)
         ┌─────────────────────┼─────────────────────┐
         │                     │                     │
      List                 Set                  Queue
   (Interface)         (Interface)         (Interface)
      │                    │                     │
 ┌────┼─────┐        ┌─────┼────────┐            │
 │    │     │        │     │        │            │
ArrayList LinkedList Vector HashSet LinkedHashSet TreeSet PriorityQueue


Map (Interface)

│

├── HashMap

├── LinkedHashMap

└── TreeMap
```

**Important Note**

Map Collection Interface ka child nahi hai.

Map ki apni alag hierarchy hoti hai.

---

# Iterable Interface

Java me Collection ko Traverse (Loop) karne ke liye Iterable Interface banaya gaya hai.

Isi ki wajah se hum Future me

• for-each loop

• Iterator

use kar payenge.

---

# Collection Interface

Collection ek Interface hai.

Ye sirf Rules Define karta hai.

Example Methods

add()

remove()

size()

clear()

contains()

ArrayList, LinkedList aur HashSet in methods ko implement karte hain.

---

# List Interface

Properties

✔ Ordered Data

✔ Duplicate Allowed

✔ Index Available

Example

```
0 → Java

1 → Python

2 → Java
```

Ye bilkul valid hai.

Real World Example

• WhatsApp Chats

• RecyclerView

• Products List

• Students List

---

# Set Interface

Properties

✔ Duplicate Not Allowed

✔ Unique Data Store karta hai.

✔ Index nahi hota.

Example

Input

```
Java

Python

Java
```

Output

```
Java

Python
```

Ek Java automatically remove ho jayega.

Real World Example

• Email IDs

• Roll Numbers

• Aadhaar Numbers

• Usernames

---

# Queue Interface

Rule

FIFO

(First In First Out)

Jo pehle aayega

Wo pehle bahar jayega.

Example

```
A

B

C
```

Output

```
A

B

C
```

Real World Example

• Download Queue

• Notification Queue

• Printer Queue

---

# Map Interface

Map Collection ka part nahi hai.

Map Data ko

Key → Value Pair

me Store karta hai.

Example

```
101 → Nitin

102 → Rahul

103 → Aman
```

Real World Example

• Student Roll Number → Student Name

• Employee ID → Employee

• Product ID → Product

---

# Kis Situation Me Kya Use Kare?

Ordered Data

→ List

---

Unique Data

→ Set

---

FIFO

→ Queue

---

Key → Value

→ Map

---

# Android Development

RecyclerView

→ List

API Response

→ List

Firebase Data

→ List

Unique Usernames

→ Set

Notification Queue

→ Queue

JSON Data

→ Map

---

# ================== GOLDEN RULES ==================

1. Iterable sabse upar Interface hai.

2. Collection ek Interface hai.

3. Collection Data ko Store aur Manage karta hai.

4. List Ordered Data Store karti hai.

5. List Duplicate Allow karti hai.

6. List me Index hota hai.

7. Set Duplicate Allow nahi karta.

8. Set Unique Data Store karta hai.

9. Queue FIFO Follow karti hai.

10. FIFO ka matlab First In First Out hota hai.

11. Map Collection Interface ka child nahi hai.

12. Map Key-Value Pair Store karta hai.

13. Android Development me sabse zyada List aur Map use hote hain.

14. Har Data Structure kisi specific problem ko solve karne ke liye banaya gaya hai.

---

# ================== PRACTICE QUESTIONS ==================

Q1. Collection Framework me alag-alag Interfaces kyu banaye gaye?

Answer:

Kyuki har Data Structure ka purpose alag hota hai.

Example

List → Ordered Data

Set → Unique Data

Queue → FIFO

Map → Key-Value Pair

---

Q2. Iterable Interface ka kaam kya hai?

Answer:

Collection ko Traverse (Loop) karne ke liye.

Isi wajah se Iterator aur for-each loop ka use hota hai.

---

Q3. Collection Interface kya hai?

Answer:

Collection ek Interface hai jo common methods define karta hai jaise

add()

remove()

size()

clear()

contains()

---

Q4. List Interface ki Properties likho.

Answer:

• Ordered

• Duplicate Allowed

• Index Available

---

Q5. Set Interface ki Properties likho.

Answer:

• Duplicate Not Allowed

• Unique Data

• Index Available nahi hota.

---

Q6. Queue kis Rule ko Follow karti hai?

Answer:

FIFO

First In First Out

---

Q7. Map kya Store karta hai?

Answer:

Key → Value Pair

---

Q8. Kya Map Collection Interface ka Child hai?

Answer:

Nahi.

Map ki alag hierarchy hai.

---

Q9. RecyclerView me kaunsi Collection use hoti hai?

Answer:

List

Mostly ArrayList

---

Q10. Unique Email Store karne ke liye kya use karoge?

Answer:

Set

Kyuki Duplicate Allow nahi karta.

---

# ================== INTERVIEW QUESTIONS ==================

Q1. Explain Collection Hierarchy.

Answer:

Collection Framework ki hierarchy me sabse upar Iterable Interface hota hai.

Uske niche Collection Interface hota hai.

Collection ke 3 main child Interfaces hote hain

List

Set

Queue

Map Collection ka part nahi hai.

Uski alag hierarchy hoti hai.

---

Q2. Difference Between List and Set?

Answer

List

• Ordered

• Duplicate Allowed

• Index Available

Set

• Duplicate Not Allowed

• Unique Data

• Index Available nahi

---

Q3. Difference Between Queue and List?

Answer

List me kisi bhi Index par Data Access kar sakte hain.

Queue FIFO Rule Follow karti hai.

---

Q4. Why Map is not a part of Collection Interface?

Answer

Kyuki Map Data ko Key-Value Pair me Store karta hai.

Jabki Collection sirf Values ko Store karta hai.

Isliye Java Designers ne Map ko alag Interface banaya.

---

Q5. Difference Between Collection and Collections?

Answer

Collection

Ek Interface hai.

Collection Data Store karta hai.

Collections

Ek Utility Class hai.

Ye Sorting, Searching, Reverse jaise Ready-made Methods provide karti hai.

---

Q6. Android me sabse zyada kaunsi Collection use hoti hai?

Answer

ArrayList

HashMap

List Interface

---

Q7. Kya List Duplicate Allow karti hai?

Answer

Haan.

---

Q8. Kya Set Duplicate Allow karta hai?

Answer

Nahi.

---

Q9. Queue kis Principle par kaam karti hai?

Answer

FIFO

First In First Out

---

Q10. Sabse Important Interview Question

Har Data Structure alag kyu banaya gaya?

Answer

Ek hi Data Structure har problem solve nahi kar sakta.

Isliye Java ne alag-alag Data Structures banaye.

List

→ Ordered Data

Set

→ Unique Data

Queue

→ FIFO

Map

→ Key-Value Pair

---

# ================== INTERVIEW POINTS ==================

• Iterable sabse upar Interface hai.

• Collection ek Interface hai.

• List Ordered + Duplicate + Indexed hoti hai.

• Set Unique Data Store karta hai.

• Queue FIFO Follow karti hai.

• Map Collection ka part nahi hai.

• Map Key-Value Pair Store karta hai.

• Android me sabse zyada List aur HashMap use hote hain.

• Collection common methods define karta hai.

• Collections ek Utility Class hai.

---

# ================== REAL WORLD EXAMPLES ==================

WhatsApp Chats

→ List

Instagram Feed

→ List

YouTube Playlist

→ List

Student Roll Number

→ Set

Unique Email IDs

→ Set

Hospital Token System

→ Queue

Railway Reservation Waiting List

→ Queue

Employee ID → Employee

→ Map

Product ID → Product

→ Map

API JSON Response

→ Map

---

# ================== REMEMBER FOREVER ==================

List

→ Ordered

→ Duplicate Allowed

→ Index Available

---

Set

→ Unique Data

→ Duplicate Not Allowed

---

Queue

→ FIFO

---

Map

→ Key → Value Pair

---

Map ≠ Collection Interface

Collection = Interface

Collections = Utility Class

Android Developers sabse zyada List (ArrayList) aur Map (HashMap) ka use karte hain.

 */