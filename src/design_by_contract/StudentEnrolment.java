// package design_by_contract;
// import java.util.*;   

// public class StudentEnrolment {
//   private final Set<String> coresOffered = new HashSet<String>( Arrays.asList("P1", "OS", "SEF", "DC", "WP"));
//   private final Set<String> electivesOffered
//       = new HashSet<String>
//   (Arrays.asList("C++", "PHP", "Web3D", "IT")); private Set<String> electives = new HashSet<String>(); private Set<String> cores = new HashSet<String>();
//   // adding a core
//   public void addCore(String core)
//   {
//     cores.add(core);
//   }
//   // adding an elective
//   public void addElective(String elective)
//   {
//     electives.add(elective);
//   }
//   // RMIT University 2020
//   // School of Science 34
//   // removing a core
//     public void removeCore(String core)
//   {
//         cores.remove(core);
//     }
//     // removing an elective
//     public void removeElective(String elective)
//   {
//         electives.remove(elective);
//     }
//     // listing all courses enrolled
//     public void display()
//   {
//     for (String course : cores) System.out.println(course);
//     for (String course : electives) System.out.println(course);
//   }
// }
