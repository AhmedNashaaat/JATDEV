# Jumia Bug Report



### JUMA-001: App Crashes During Checkout
- **Severity**: Critical  
- **Description**: The app crashes when proceeding to checkout, especially when selecting payment.  
- **Steps to Reproduce**:  
  1. Add items to cart.  
  2. Proceed to checkout.  
  3. Select payment method.  
  4. App crashes.  
- **Expected Behavior**: Smooth checkout process.  
- **Actual Behavior**: App force-closes, transaction incomplete.  

---

### JUMA-002: Incorrect Product Search Results  
- **Severity**: High  
- **Description**: Search returns irrelevant products despite precise queries.  
- **Steps to Reproduce**:  
  1. Search for "iPhone 15 Pro Max".  
  2. Observe unrelated items (cases, accessories).  
- **Expected Behavior**: Accurate, relevant results.  
- **Actual Behavior**: Mismatched/low-quality listings.  

---

### JUMA-003: Delivery Address Not Saving  
- **Severity**: Medium  
- **Description**: Saved addresses disappear after app restart.  
- **Steps to Reproduce**:  
  1. Add a new address.  
  2. Close & reopen app.  
  3. Address missing.  
- **Expected Behavior**: Addresses persist after saving.  
- **Actual Behavior**: Data loss on restart.  

---

### JUMA-004: Discount Codes Not Applying  
- **Severity**: High  
- **Description**: Valid promo codes fail or apply incorrect discounts.  
- **Steps to Reproduce**:  
  1. Apply valid promo code.  
  2. Code rejected or wrong discount applied.  
- **Expected Behavior**: Correct discount per terms.  
- **Actual Behavior**: "Invalid code" or wrong price.  

---

### JUMA-005: Persistent Login Issues  
- **Severity**: Medium  
- **Description**: Users get logged out frequently or face auth errors.  
- **Steps to Reproduce**:  
  1. Log in successfully.  
  2. Return later—session expired.  
  3. Re-login fails.  
- **Expected Behavior**: Stable session until manual logout.  
- **Actual Behavior**: Forced logouts/login failures.  

---

**Last Updated**: [13/4/2025]  