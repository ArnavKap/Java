# ☕ Java IntelliJ IDEA Cheat Sheet

A concise reference for Java developers using IntelliJ IDEA. This guide includes the most useful **Live Templates** and **Keyboard Shortcuts** to boost your productivity.

---

## 📦 Java Live Templates (Type and Press Tab)

### 🖥️ Console Output

| Abbreviation | Expands To                                |
|--------------|-------------------------------------------|
| `sout`       | `System.out.println();`                   |
| `soutv`      | `System.out.println(variable);`           |
| `soutm`      | `System.out.println("methodName");`       |
| `soutp`      | `System.out.println("param = " + param);` |
| `serr`       | `System.err.println();`                   |

### 🔁 Loops

| Abbreviation | Expands To                                       |
|--------------|--------------------------------------------------|
| `fori`       | `for (int i = 0; i < n; i++) {}`                 |
| `iter`       | `for (Type item : collection) {}`                |
| `itar`       | `for (int i = 0; i < array.length; i++) {}`      |

### 🔍 Conditions

| Abbreviation | Expands To                      |
|--------------|---------------------------------|
| `ifn`        | `if (var == null) {}`           |
| `inn`        | `if (var != null) {}`           |
| `null`       | `if (object == null) {...}`     |
| `notnull`    | `if (object != null) {...}`     |
| `inst`       | `if (object instanceof Type)`   |

### ⚠️ Exception Handling

| Abbreviation | Expands To                          |
|--------------|-------------------------------------|
| `try`        | `try { } catch (Exception e) {}`    |
| `tryf`       | `try { } finally {}`                |
| `tryc`       | `try { } catch (Exception e) {}`    |
| `thr`        | `throw new Exception();`            |
| `thrown`     | `throw new NullPointerException();` |

### 🔧 Miscellaneous

| Abbreviation   | Expands To                                       |
|----------------|--------------------------------------------------|
| `psvm`         | `public static void main(String[] args) {}`      |
| `main`         | Same as `psvm`                                   |
| `return`       | `return;` or `return value;`                     |
| `synchronized` | `synchronized (lock) {}`                         |

---

## ⌨️ Essential IntelliJ Keyboard Shortcuts

### 🚀 Coding Productivity

| Action                          | Shortcut (Win/Linux)      | Shortcut (macOS)      |
|---------------------------------|---------------------------|-----------------------|
| Code Completion (basic)         | `Ctrl + Space`            | `Cmd + Space`         |
| Smart Completion                | `Ctrl + Shift + Space`    | `Cmd + Shift + Space` |
| Quick Fix / Show Intent Actions | `Alt + Enter`             | `Option + Enter`      |
| Show Documentation              | `Ctrl + Q`                | `F1` or `Ctrl + J`    |
| Parameter Info                  | `Ctrl + P`                | `Cmd + P`             |
| Override Methods                | `Ctrl + O`                | `Cmd + O`             |
| Implement Methods               | `Ctrl + I`                | `Cmd + I`             |
| Generate Code (getters/setters) | `Alt + Insert`            | `Cmd + N`             |
| Surround with...                | `Ctrl + Alt + T`          | `Cmd + Option + T`    |
| Reformat Code                   | `Ctrl + Alt + L`          | `Cmd + Option + L`    |

### 🔍 Navigation

| Action                  | Shortcut (Win/Linux)           | Shortcut (macOS)          |
|-------------------------|--------------------------------|---------------------------|
| Go to Class             | `Ctrl + N`                     | `Cmd + O`                 |
| Go to File              | `Ctrl + Shift + N`             | `Cmd + Shift + O`         |
| Go to Symbol            | `Ctrl + Alt + Shift + N`       | `Cmd + Option + O`        |
| Recent Files            | `Ctrl + E`                     | `Cmd + E`                 |
| Navigate to Declaration | `Ctrl + B` / `Ctrl + Click`    | `Cmd + B` / `Cmd + Click` |
| Find Usages             | `Alt + F7`                     | `Option + F7`             |

### 🧹 Refactoring

| Action                         | Shortcut (Win/Linux) | Shortcut (macOS)   |
|--------------------------------|----------------------|--------------------|
| Rename                         | `Shift + F6`         | `Shift + F6`       |
| Change Signature               | `Ctrl + F6`          | `Cmd + F6`         |
| Extract Variable               | `Ctrl + Alt + V`     | `Cmd + Option + V` |
| Extract Method                 | `Ctrl + Alt + M`     | `Cmd + Option + M` |
| Extract Field                  | `Ctrl + Alt + F`     | `Cmd + Option + F` |

---

## ✍️ Create Custom Live Templates

1. `File → Settings → Editor → Live Templates`
2. Click ➕ to add a template
3. Define:
    - **Abbreviation**
    - **Template code**
    - **Applicable context** (e.g., Java → statement)

---

## 📚 Resources

- [Official IntelliJ Live Templates Docs](https://www.jetbrains.com/help/idea/using-live-templates.html)
- [IntelliJ Keymap Reference (PDF)](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)

---

> 💡 **Pro Tip:** Mastering 10–15 of these shortcuts will significantly boost your coding speed.

Happy coding! 🚀
