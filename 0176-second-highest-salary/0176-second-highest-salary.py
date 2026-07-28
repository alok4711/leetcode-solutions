import pandas as pd

def second_highest_salary(employee: pd.DataFrame) -> pd.DataFrame:
    employee = employee.drop_duplicates(subset=["salary"])
    if(len(employee)<2):
        return pd.DataFrame({"SecondHighestSalary": [None]})
    employee.sort_values(by="salary", inplace=True)
    return pd.DataFrame({"SecondHighestSalary": [employee.iloc[-2]["salary"]]})