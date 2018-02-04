public boolean gHappy(String str) {
  return str.matches(".*[g]{2}[^g]*") || str.isEmpty();
}
