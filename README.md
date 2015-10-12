# s99problems

# P26 

 def kx(m, lst):
     if m == 0: return [[]]
     lists = []
     for i, x in enumerate(lst):
         for suffix in comb(m - 1, lst[i + 1:]):
             lists.append([x]+ suffix)
     return lists
 

