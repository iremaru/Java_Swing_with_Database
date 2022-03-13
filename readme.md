# 🔆DB and Java Swing🔆

## 📓Project definition📓

![img.png](dev/img/v_projectDefinition.png)

🗣 **DB and Java Swing proyect**

☝ Mandatory requirements:
- 1️⃣ CRUD from "Persona" table in the db.
- 2️⃣ CRUD from "Asignatura" table.

☝ Optional requirements:
- 1️⃣ Implement the search from both tables applying filters

> ❗ **NOTE:** Please, take into account there are 2 data model files in the template, thus there must be 
 also 2 controllers files.
 
## 👩‍💻Project development👩‍💻

### 🔎State of the work

|Initial appearance | Current appearance |
|----|----|
|![Main window](dev/img/v0_state_MainWindowWithData.png) | ![curren appeal](dev/img/v0-1_state_MainWindowCRUD.png) |

|Initial architecture | Desired architecture |
|----|----|
|![Current architecture](dev/img/Architecture_Initial.png)| ![Desired architecture](dev/img/Architecture_target.png) |

### 📋TODOs

- ⬜ _Persona_ CRUD
  - ✅ Get data from _Persona_ table
  - ⬜ Create new _Persona_
  - ⬜ Show _Persona_ data in UI
  - ⬜ Update _Persona_ data
  - ⬜ Delete _Persona_ data
- ⬜ _Asignatura_ CRUD
  - ✅ Get data from _Asignatura_ table
  - ⬜ Create new _Asignatura_
  - ⬜ Show _Asignatura_ data in UI
  - ⬜ Update _Asignatura_ data
  - ⬜ Delete _Asignatura_ data

### ❓Possible improvements detected

⬜ 🐞 When closing the app, if there isn't a database linked, the app can't be closed.
![Mayor Bug: App can't be closed](dev/img/v0_issue_1-main_appCantBeClosed.png)

⬜ 🎨 Unaesthetic ui: There is no margin nor padding between elements and the window borders.
![Minnor issue: There aren't margin nor padding](dev/img/v0_issue_3-trivial_marginsAndPaddings.png)

⬜ 🎨 Improve the aesthetic UI: (example below)
![ui reworked example](dev/img/v0_issue_3-trivial_reworkUI.png)
