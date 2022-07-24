package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
//            등록(Create)
//            Member member = new Member();
//            member.setId(1L);
//            member.setName("HelloA");
//            em.persist(member);

//            조회1(Retrieve1)
//            Member findMember = em.find(Member.class, 1L);
//            System.out.println("findMember.id: " + findMember.getId());
//            System.out.println("findMember.name: " + findMember.getName());

//            조회2(Retrieve2)
//            List<Member> memberList = em.createQuery("select m from Member as m", Member.class).getResultList();
//            for(Member m : memberList) {
//                System.out.println("member.name: " + m.getName());
//            }

//            수정(Update)
//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("HelloJPA");

//            삭제(Delete)
//            em.remove(em.find(Member.class, 2L));

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
