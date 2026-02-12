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

<img width="763" height="748" alt="image" src="https://github.com/user-attachments/assets/f9e685ef-c953-45a5-918f-460b711172ca" />

<img width="804" height="124" alt="image" src="https://github.com/user-attachments/assets/f0cfe86e-847b-4200-9347-f6839ad494d4" />

<img width="771" height="780" alt="image" src="https://github.com/user-attachments/assets/dceb851a-d8e8-4eea-848d-73bbefcd6287" />





