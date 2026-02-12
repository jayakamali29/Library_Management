# 📚 Library Management System

A functional **Library Management System** web application built using **HTML, CSS, and JavaScript**.  
It provides a digital interface for users to catalog books, track borrowing status, and manage a collection in real-time within the browser.

---

## ✨ Features

- **Book Inventory Management**  
  Add books by entering the title, author, and selecting a genre.

- **Dynamic Book List**  
  Table rows are generated dynamically for every new entry without refreshing the page.

- **Status Tracking**  
  - Toggleable status: *Available* ↔ *Borrowed*  
  - Visual indicators change color based on status.

- **Responsive & Styled Design**  
  - Clean, modern UI with focus on readability.  
  - Interactive buttons for deleting entries and updating availability.

- **Form Validation**  
  - Prevents empty entries.  
  - Ensures required fields (Title & Author) are filled before submission.

---

## 📂 Files

### 1. `index.html`
- Core HTML structure.  
- Includes:
  - Heading (`<h1>`) titled *Digital Library Manager*.  
  - Input section (Title, Author, Genre dropdown).  
  - "Add Book" button.  
  - `<table>` to display book collection.

### 2. Inline CSS
- Defined inside `<style>` block.  
- Key styles:
  - Centered layout with professional background.  
  - Status badges (Green = Available, Red = Borrowed).  
  - Clean table design with borders, padding, hover effects.  
  - Responsive widths for mobile & desktop.

### 3. Inline JavaScript
- Defined inside `<script>` block.  
- Functions:
  - `addBook()`: Validates form, creates book object, appends row.  
  - `toggleStatus(button)`: Switches status between *Available* and *Borrowed*.  
  - `removeBook(button)`: Deletes a book entry.  
  - `clearFields()`: Resets input fields after adding a book.

---

## 🚀 Usage Instructions

1. Open `index.html` in a modern web browser.  
2. Enter **Title** and **Author**.  
3. Select a **Genre**.  
4. Click **Add Book** to register it.  
5. Use the **Status button** to toggle availability.  
6. Use the **Delete button** to remove a book permanently.

---

## 🛠 Requirements

- A modern web browser (Chrome, Firefox, Safari).  
- JavaScript enabled.  
- No external databases or servers required (runs entirely client-side).

---

## 🔧 Customization Ideas

- **Persistent Data**: Use `localStorage` to keep books after refresh.  
- **Search Bar**: Add real-time filtering by title or author.  
- **Category Icons**: Use icons (e.g., FontAwesome) for genres like Fiction, Science, History.

---

## ⚠️ Known Limitations

- **Session-Based**: Data is lost on refresh (unless `localStorage` is added).  
- **No User Accounts**: Local-only tool, no multi-user or cloud sync.

---

## 👨‍💻 Credits

Designed and developed using **HTML5, CSS3, and ES6+ JavaScript**.

![WhatsApp Image 2026-02-12 at 9 13 38 AM](https://github.com/user-attachments/assets/1850411e-3bad-428a-966d-313ad494f4f9)

![WhatsApp Image 2026-02-12 at 9 13 43 AM](https://github.com/user-attachments/assets/a461c96c-4836-4183-82ca-fbc662f3abe0)

![WhatsApp Image 2026-02-12 at 9 13 54 AM](https://github.com/user-attachments/assets/c14cad7f-a53c-48fa-9af9-30f20396332c)



