# PatikaStore Virtual Shop Application

This Java application simulates a virtual store managed by the Patika team. This store can manage various electronic products such as mobile phones and notebooks.

## Used Classes and Features

1. **Brand:** Represents brands. Each brand is identified by an ID and a name.
2. **MobilePhone:** Represents mobile phone products. It includes properties such as name, price, stock count, brand, memory, screen size, battery, RAM, and color.
3. **Notebook:** Represents notebook products. It includes properties such as name, price, stock count, brand, screen size, RAM, storage, and color.
4. **Product:** Abstract class that contains common properties of other product classes.
5. **PatikaStore:** Manages the virtual store, provides the user interface, and performs operations.

## User Operations

- Users can add products. Depending on the type of product (mobile phone or notebook), they should enter the relevant properties.
- Users can delete added products by entering their IDs.
- Users can list existing brands.
- Users can list added mobile phone and notebook products.

## How to Use?

1. Open the project files in a Java IDE.
2. Run the `Main` class to start the program.
3. Upon starting the program, various options will appear in the user interface. Choose the option you want to perform.
4. If you want to add a new product, follow the relevant menu steps and enter the required information.
5. Use the menu options to list, delete, or list brands of products.
6. To exit the program, choose the `0` option.
