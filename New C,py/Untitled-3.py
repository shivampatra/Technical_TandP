def generate_parentheses(n):
    def backtrack(s='', left=0, right=0):
        # If the current string `s` is of length 2 * n, it's a valid combination
        if len(s) == 2 * n:
            result.append(s)
            return
        
        # Add an opening parenthesis if we haven't used all `n` opening parentheses
        if left < n:
            backtrack(s + '(', left + 1, right)
        
        # Add a closing parenthesis if it doesn't exceed the number of opening parentheses
        if right < left:
            backtrack(s + ')', left, right + 1)
    
    result = []  # Initialize an empty list to collect results
    backtrack()
    return result

# Example usage
n = int(input("Enter the number of pairs of parentheses: "))
combinations = generate_parentheses(n)
print("Generated combinations:")
for combo in combinations:
    print(combo)
