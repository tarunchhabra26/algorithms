def get_balanced(input_str):
    counter = 0
    if input_str.count('(') + input_str.count(')') == len(input_str):
        return ''
    for i in input_str:
        if i == "(":
            counter += 1
        
        else:
            if i == ")":
                if counter > 0:
                    counter -= 1
                else:
                    input_str = input_str.replace(')', '', 1)
if counter > 0:
    input_str = input_str.replace('(', '', counter)
    else:
        input_str = input_str.replace(')', '', counter)
return input_str


get_balanced("))(f(")

get_balanced("((a+b)))")

get_balanced("(((((()))")

get_balanced("((a((")
get_balanced(")))fb((")
get_balanced("ads(ad)")
