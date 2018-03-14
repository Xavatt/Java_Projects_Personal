package com.ragedragon;

public class Car
{
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colours;

    public void setModel(String model)
    {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore"))
        {
            this.model = model;
        }
        else
        {
            this.model = "Unknown";
        }

    }

    public String getModel()
    {
        return this.model;
    }
}
